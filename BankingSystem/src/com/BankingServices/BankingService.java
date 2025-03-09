package com.BankingServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingService {
    private List<Customer> customers = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();
    private List<Beneficiary> beneficiaries = new ArrayList<>();
    private int customerIDCounter = 1;
    private int accountIDCounter = 1;
    private int transactionIDCounter = 1;
    private int beneficiaryIDCounter = 1;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nBanking System");
            System.out.println("1. Add Customers");
            System.out.println("2. Add Accounts");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by Id");
            System.out.println("6. List all Accounts of specific Customer");
            System.out.println("7. List all transactions of specific Account");
            System.out.println("8. List all beneficiaries of specific customer");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addCustomer(scanner);
                    break;
                case 2:
                    addAccount(scanner);
                    break;
                case 3:
                    addBeneficiary(scanner);
                    break;
                case 4:
                    addTransaction(scanner);
                    break;
                case 5:
                    findCustomerById(scanner);
                    break;
                case 6:
                    listAccountsOfCustomer(scanner);
                    break;
                case 7:
                    listTransactionsOfAccount(scanner);
                    break;
                case 8:
                    listBeneficiariesOfCustomer(scanner);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private void addCustomer(Scanner scanner) {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer address: ");
        String address = scanner.nextLine();
        System.out.print("Enter customer contact: ");
        String contact = scanner.nextLine();

        Customer customer = new Customer(customerIDCounter++, name, address, contact);
        customers.add(customer);
        System.out.println("Customer added successfully: " + customer);
    }

    private void addAccount(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine(); 

        if (!isCustomerExists(customerID)) {
            System.out.println("Customer does not exist.");
            return;
        }

        System.out.print("Enter account type (e.g., Checking, Savings): ");
        String type = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();

        Account account = new Account(accountIDCounter++, customerID, type, balance);
        accounts.add(account);
        System.out.println("Account added successfully: " + account);
    }

    private void addBeneficiary(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine(); 

        if (!isCustomerExists(customerID)) {
            System.out.println("Customer does not exist.");
            return;
        }

        System.out.print("Enter beneficiary name: ");
        String name = scanner.nextLine();
        System.out.print("Enter beneficiary account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter beneficiary bank details: ");
        String bankDetails = scanner.nextLine();

        Beneficiary beneficiary = new Beneficiary(beneficiaryIDCounter++, customerID, name, accountNumber, bankDetails);
        beneficiaries.add(beneficiary);
        System.out.println("Beneficiary added successfully: " + beneficiary);
    }

    private void addTransaction(Scanner scanner) {
        System.out.print("Enter account ID: ");
        int accountID = scanner.nextInt();
        scanner.nextLine();

        if (!isAccountExists(accountID)) {
            System.out.println("Account does not exist.");
            return;
        }

        System.out.print("Enter transaction type (deposit/withdrawal): ");
        String type = scanner.nextLine();
        System.out.print("Enter transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

        Transaction transaction = new Transaction(transactionIDCounter++, accountID, type, amount);
        transactions.add(transaction);
        System.out.println("Transaction added successfully at " + transaction.getTimestamp() + ": " + transaction);

        // Update account balance
        for (Account account : accounts) {
            if (account.getAccountID() == accountID) {
                if (type.equals("deposit")) {
                    account.setBalance(account.getBalance() + amount);
                } else if (type.equals("withdrawal")) {
                    account.setBalance(account.getBalance() - amount);
                }
                break;
            }
        }
    }

    
    private void findCustomerById(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine(); 

        for (Customer customer : customers) {
            if (customer.getCustomerID() == customerID) {
                System.out.println("Customer found: " + customer);
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    private void listAccountsOfCustomer(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine(); 

        boolean found = false;
        for (Account account : accounts) {
            if (account.getCustomerID() == customerID) {
                System.out.println("Account: " + account);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No accounts found for this customer.");
        }
    }

    private void listTransactionsOfAccount(Scanner scanner) {
        System.out.print("Enter account ID: ");
        int accountID = scanner.nextInt();
        scanner.nextLine(); 

        boolean found = false;
        for (Transaction transaction : transactions) {
            if (transaction.getAccountID() == accountID) {
                System.out.println("Transaction occurred at " + transaction.getTimestamp() + ": " + transaction);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No transactions found for this account.");
        }
    }


    private void listBeneficiariesOfCustomer(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Beneficiary beneficiary : beneficiaries) {
            if (beneficiary.getCustomerID() == customerID) {
                System.out.println("Beneficiary: " + beneficiary);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No beneficiaries found for this customer.");
        }
    }

    private boolean isCustomerExists(int customerID) {
        for (Customer customer : customers) {
            if (customer.getCustomerID() == customerID) {
                return true;
            }
        }
        return false;
    }

    private boolean isAccountExists(int accountID) {
        for (Account account : accounts) {
            if (account.getAccountID() == accountID) {
                return true;
            }
        }
        return false;
    }

}

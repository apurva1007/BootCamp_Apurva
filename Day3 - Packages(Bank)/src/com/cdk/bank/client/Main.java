/*Create a Java Application which will have 2-3 classes based banking domain
class names:
1. AccountService
2. Customer Service
3. Account
4. Customer
5. BranchService
6. BankService
7. Main
package to be created 
package names to be meaningful
atleast 3 level of packaging
class will inherit from different packages
main class will be in a independent package calld "client" as last package*/

package com.cdk.bank.client;

import com.cdk.bank.customer.*;
import com.cdk.bank.services.*;
import org.junit.Test;

public class Main {

    @Test
    public void testBankServices() {

        Customer customer = new Customer("SDF", 789489L, "DFDF", 809, 87080);
        CustomerService customerService = new CustomerService();

        customer.details();
        customerService.serve();
        customerService.depositMoney();

        BankService bankService = new BankService();
        bankService.getLoan();

        BranchService branchService = new BranchService();
        branchService.getSpecialDiscount();
    }

}


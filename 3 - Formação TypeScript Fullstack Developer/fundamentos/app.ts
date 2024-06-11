import { CompanyAccount } from './class/CompanyAccount';
import { PeopleAccount } from './class/PeopleAccount';

const peopleAccount: PeopleAccount = new PeopleAccount(1, "Tiago", 10);
console.log(peopleAccount)
peopleAccount.deposit(50)
const companyAccount: CompanyAccount = new CompanyAccount('DIo', 20)
companyAccount.deposit()
peopleAccount.withdraw(30)
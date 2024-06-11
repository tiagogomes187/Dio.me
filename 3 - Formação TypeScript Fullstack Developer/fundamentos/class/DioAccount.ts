export abstract class DioAccount {
    private name: string;
    private readonly accountNumber: number;
    balance: number = 0;
    private status: boolean = true
  
    constructor(name: string, accountNumber: number) {
      this.name = name;
      this.accountNumber = accountNumber;
    }

    getAccountNumber = (accountNumber: number) => {
      return this.accountNumber
    }

    setName =(name: string): void => {
      this.name = name
      console.log('Nome alterado com sucesso!')
    }

    getName = (): string => {
      return this.name
    }
  
    deposit = (balance: number): void => {
      if(this.validateStatus()){
        this.balance =+ balance 
      }
      console.log(balance)
    };
  
    withdraw = (cashout: number): void => {
      if(this.balance > cashout && this.status === true) {
        this.balance =this.balance - cashout
        this.getBalance()
      }else{
        console.log('Saldo insuficiente')
      }
    };
  
    getBalance = (): void => {
      console.log(this.balance);
    };

    private validateStatus = (): boolean => {
      if (this.status){
        return this.status
      }

      throw new Error('Conta inválida')
    }
  }
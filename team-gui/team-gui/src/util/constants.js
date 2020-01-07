//Generic imports
export const FORM_NAME = "name";
export const FORM_EMAIL = "email";
export const FORM_PASSWORD = "password";


//backend URLS
export const ACCOUNT_API_URL = 'accounts/v2/accounts';


//methods
export function createAccount(name, email, password) {
    return new Account(name, email, password)
}


//classes
export class Account {
    constructor(name, email, password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
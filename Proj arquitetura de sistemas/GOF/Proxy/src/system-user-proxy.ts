import {Address, SystemUser} from './system-user-protocol';
import {AdminUser} from './admin-user';

export class ProxyHandler implements SystemUser{
    
    private User: SystemUser | null = null;
    private UserAddress: Address[] | null = null;

    public name: string;
    public username: string;

    constructor(name: string, username: string){
        this.name = name;
        this.username = username;
    }
    private CreateUser(): SystemUser {
        if(this.User === null){
            this.User = new AdminUser(this.name, this.username);
        }
        return this.User;
    }
    async getAddress(): Promise<Address[]> { 
        this.User = this.CreateUser();

        if(this.UserAddress === null) {
            this.UserAddress = await this.User.getAddress();
        }
        return this.User.getAddress();
    }
}
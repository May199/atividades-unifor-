import {Address, SystemUser} from './system-user-protocol';

export class AdminUser implements SystemUser{
    
    public name: string;
    public username: string;

    constructor(name: string, username: string){
        this.name = name;
        this.username = username;
    }
    async getAddress(): Promise<Address[]> {
        return new Promise<Address[]>((resolve) => {
            return setTimeout(() =>{
                return resolve([
                    {street: 'Rua mil e um', number: 10},
                    {street: 'Rua mil e dois', number: 11},
                    {street: 'Rua mil e três', number: 12}
                ])
            }, 1000);
        })
        throw new Error('Method not implemented.');
    }
}
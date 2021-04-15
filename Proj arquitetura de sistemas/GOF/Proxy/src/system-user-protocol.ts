export type Address = {street: string, number: number}

export interface SystemUser{
    name: string;
    username: string;

    getAddress(): Promise<Address[]>;
}

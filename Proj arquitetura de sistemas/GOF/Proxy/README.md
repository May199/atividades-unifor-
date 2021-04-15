### Padrão de Projeto Proxy

#### Padrão Proxy
> Intenção: Prover um substituto para um objeto X; Através desse substituto, pode-se controlar o acesso a X.

> Neste exemplo utilizei o padrão de projeto Proxy Virtual. Estou utilizando a linguagem TypeScript para fins de estudo da própria linguagem e por ela simular o JavaScript e possuir uma tipagem. 

- Proxy Virtual: controla acesso a recursos que podem ser caros para criação ou utilização. Basicamente, cria um cache para responder a consultas posteriores mais rápidamente. 

> Antes de proceguir com as modificações do código, é necessário converter o TS para JS usando o código abaixo.

    $ tsc src/main.ts 

> Se caso não queira modificar e só queira ver o resultado pode utilizar os arquivos JS já convertidos. 

    $ node src/main.js

> A classe `ProxyHandler` simula a criação de um usuário e manipula as informações da classe `AdminUser` criando assim um substituto para o objeto original `AdminUser`

``` TypeScript 

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

```

---
#### Material de Estudo 

- Proxy Teoria - Padrões de Projeto - Parte 23/45
https://www.youtube.com/watch?v=EsxPyICeBPs&list=PLbIBj8vQhvm0VY5YrMrafWaQY2EnJ3j8H&index=23 

- Proxy Prática - Padrões de Projeto - Parte 24/45
https://www.youtube.com/watch?v=xMV22kmnOo8&list=PLbIBj8vQhvm0VY5YrMrafWaQY2EnJ3j8H&index=24

- TypeScript, o início, de forma prática | MasterClass #07
https://www.youtube.com/watch?v=0mYq5LrQN1s
import {ProxyHandler} from './system-user-proxy';

async function Client(): Promise<void> {
    const user = new ProxyHandler('Manu', 'May');
    
    console.log('Consultando objeto pedido do usuário: ',user.username);
    console.log(await user.getAddress());

    for(let i = 0; i < 4; i++){
        console.log('Memória Cache');
        console.log(await user.getAddress());
    }
}
Client();
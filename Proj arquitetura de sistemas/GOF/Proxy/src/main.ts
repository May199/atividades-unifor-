import {ProxyHandler} from './system-user-proxy';

async function Client(): Promise<void> {
    const user = new ProxyHandler('Manu', 'May');
    
    console.log('Leva 1 segundo');
    console.log(await user.getAddress(), user.name, user.username);

    console.log('CACHE');
    for(let i = 0; i < 4; i++){
        console.log(await user.getAddress(), user.name, user.username);
    }
}
Client();
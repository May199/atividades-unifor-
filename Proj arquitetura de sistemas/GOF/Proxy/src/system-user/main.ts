import {ProxyHandler} from './system-user-proxy';

async function Client(): Promise<void> {
    const user = new ProxyHandler('Manu', 'May');
    console.log(await user.getAddress());
    console.log('deu bom');
}
Client();
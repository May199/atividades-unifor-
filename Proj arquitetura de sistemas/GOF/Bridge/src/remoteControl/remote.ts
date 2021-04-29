import { apparatusImplementation } from "../apparatus/apparatus-implementation";

// a class RemoteControl seria uma abstrção pois ela apenas manda executar e não executa, 
// quem executa é o dispositivo. 

export class RemoteControl{
    constructor(protected apparatus: apparatusImplementation){}

    // Aumentar e diminuir volume
    volumeUp(): void{
        const oldVolume = this.apparatus.getVolume();
        this.apparatus.setVolume(this.apparatus.getVolume() + 10);
        console.log(`${this.apparatus.getName()} volume era ${oldVolume} agora é ${this.apparatus.getVolume()}`)
    }
    volumeDown(): void{
        const oldVolume = this.apparatus.getVolume();
        this.apparatus.setVolume(this.apparatus.getVolume() - 10);
        console.log(`${this.apparatus.getName()} volume era ${oldVolume} agora é ${this.apparatus.getVolume()}`)
    }
    // Ativar o power do dispositivo
    togglePower(): void{
        // Ao apertar o botão o inverso do estado atual será executado. 
        this.apparatus.setPower(!this.apparatus.getPower());
        console.log(`${this.apparatus.getName()} power: ${this.apparatus.getPower()}`);
    }
}
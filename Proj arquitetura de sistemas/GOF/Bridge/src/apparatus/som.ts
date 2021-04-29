import { apparatusImplementation } from "./apparatus-implementation";

export class Som implements  apparatusImplementation{
    private volume = 10;
    private power = false;
    private name = "Caixa de Som";

    getName(): string { return this.name; }
    
    setPower(PowerState: boolean): void { this.power = PowerState; }
    getPower(): boolean { return this.power; }

    setVolume(volume: number): void {
        if(volume < 0) return;
        if(volume > 100) return;

        this.volume = volume;
    }
    getVolume(): number { return this.volume; }
}

// Estou contruindo os get e set manualmente para que a implementação não fique restrita a TS 
// poderia ser realizada com qualquer outra linguagem, como JS 

export interface apparatusImplementation {
    getName(): string;
    getPower(): boolean;
    setPower(PowerState: boolean): void;
    getVolume(): number;
    setVolume(arg0: number);
}
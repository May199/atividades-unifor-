### Padrão de Projeto Bridge 

#### Padrão Bridge 
> Intenção: Desacoplar uma abstração da sua implementação, de modo que as duas possam variar independentemente.

> Neste exemplo utilizei o exemplo de um controle remoto e um aparelho de som, simulando o ligar e desligar e o volume do mesmo. Estou utilizando a linguagem TypeScript para fins de estudo da própria linguagem. 

> Antes de proceguir com as modificações do código, é necessário converter o TS para JS usando o código abaixo.

    $ tsc src/main.ts 

> Se caso não queira modificar e só queira ver o resultado pode utilizar os arquivos JS já convertidos. 

    $ node src/main.js

> A classe `RemoteControl` envia os comandos para serem executados pelo dispositivo `Som`

``` TypeScript 

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

```

---
#### Material de Estudo 

- Bridge Teoria - Padrões de Projeto - Parte 18/45
https://www.youtube.com/watch?v=-gsuMWLxAko&list=PLbIBj8vQhvm0VY5YrMrafWaQY2EnJ3j8H&index=18

- Bridge Prática - Padrões de Projeto - Parte 19/45
https://www.youtube.com/watch?v=UwffEVRttZ8&list=PLbIBj8vQhvm0VY5YrMrafWaQY2EnJ3j8H&index=20

- Livro Padrões de Projetos: Soluções Reutilizáveis de Software Orientados a Objetos - A partir da página 146
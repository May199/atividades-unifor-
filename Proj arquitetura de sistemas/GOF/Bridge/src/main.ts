import { Som } from "./apparatus/som";
import { RemoteControl } from "./remoteControl/remote";

export function user(abstract: RemoteControl): void {
    
    abstract.togglePower();
    
    if(!('volumeUp' in abstract)) return;
    
    abstract.volumeUp();
    abstract.volumeUp();
    abstract.volumeDown();
}

const som = new Som();
const SomRemoteControl =  new RemoteControl(som);
user(SomRemoteControl);
"use strict";
exports.__esModule = true;
exports.RemoteControl = void 0;
// a class RemoteControl seria uma abstrção pois ela apenas manda executar e não executa, quem executa é o dispositivo. 
var RemoteControl = /** @class */ (function () {
    function RemoteControl(apparatus) {
        this.apparatus = apparatus;
    }
    // Aumentar e diminuir volume
    RemoteControl.prototype.volumeUp = function () {
        var oldVolume = this.apparatus.getVolume();
        this.apparatus.setVolume(this.apparatus.getVolume() + 10);
        console.log(this.apparatus.getName() + " volume era " + oldVolume + " agora \u00E9 " + this.apparatus.getVolume());
    };
    RemoteControl.prototype.volumeDown = function () {
        var oldVolume = this.apparatus.getVolume();
        this.apparatus.setVolume(this.apparatus.getVolume() - 10);
        console.log(this.apparatus.getName() + " volume era " + oldVolume + " agora \u00E9 " + this.apparatus.getVolume());
    };
    // Ativar o power do dispositivo
    RemoteControl.prototype.togglePower = function () {
        // Ao apertar o botão o inverso do estado atual será executado. 
        this.apparatus.setPower(!this.apparatus.getPower());
        console.log(this.apparatus.getName() + " power: " + this.apparatus.getPower());
    };
    return RemoteControl;
}());
exports.RemoteControl = RemoteControl;

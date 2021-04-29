"use strict";
exports.__esModule = true;
exports.Som = void 0;
var Som = /** @class */ (function () {
    function Som() {
        this.volume = 10;
        this.power = false;
        this.name = "Caixa de Som";
    }
    Som.prototype.getName = function () { return this.name; };
    Som.prototype.setPower = function (PowerState) { this.power = PowerState; };
    Som.prototype.getPower = function () { return this.power; };
    Som.prototype.setVolume = function (volume) {
        if (volume < 0)
            return;
        if (volume > 100)
            return;
        this.volume = volume;
    };
    Som.prototype.getVolume = function () { return this.volume; };
    return Som;
}());
exports.Som = Som;

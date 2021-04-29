"use strict";
exports.__esModule = true;
exports.user = void 0;
var som_1 = require("./apparatus/som");
var remote_1 = require("./remoteControl/remote");
function user(abstract) {
    abstract.togglePower();
    if (!('volumeUp' in abstract))
        return;
    abstract.volumeUp();
    abstract.volumeUp();
    abstract.volumeDown();
}
exports.user = user;
var som = new som_1.Som();
var SomRemoteControl = new remote_1.RemoteControl(som);
user(SomRemoteControl);

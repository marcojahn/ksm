Ext.define('KSM.controller.Werkzeug', {
    extend: 'Ext.app.Controller',

    models: ['Werkzeug'],
    stores: ['Werkzeuge'],

    onLaunch: function () {
        this.getWerkzeugeStore().load();
    }
});
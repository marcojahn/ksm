Ext.onReady(function () {
    Ext.Ajax.defaultHeaders = {
        'Content-Type': 'application/json; charset=UTF-8'
    };

    Ext.application({
        name: 'KSM',
        autoCreateViewport: true,

        controllers: ['KSM.controller.Werkzeug'],

        launch: function () {
            console.log('application launch')
        }
    });
}());
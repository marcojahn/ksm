Ext.define('KSM.store.Werkzeuge', {
    extend: 'Ext.data.Store',

    storeId: 'Werkzeuge',

    model: 'KSM.model.Werkzeug',

    proxy: {
        type: 'ajax',
        url: './services/werkzeug'
    },

    buffered: false/*,

    autoLoad: true*/

});
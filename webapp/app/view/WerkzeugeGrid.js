Ext.define('KSM.view.WerkzeugeGrid', {
    extend: 'Ext.grid.GridPanel',

    requires: [
        'KSM.store.Werkzeuge'
    ],

    alias: 'widget.werkzeugegrid',

    title: 'Simpsons',
    store: 'Werkzeuge',
    columns: [
        { text: 'id',  dataIndex: 'id', editor: undefined },
        { text: 'Werkzeug', dataIndex: 'werkzeug', flex: 1, editor: 'textfield' }
    ],

    selType: 'rowmodel',
    plugins: [
        Ext.create('Ext.grid.plugin.RowEditing', {
            clicksToEdit: 1
        })
    ]
});
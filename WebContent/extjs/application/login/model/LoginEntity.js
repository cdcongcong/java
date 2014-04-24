Ext.define('Ext.app.LoginEntity', {
    extend: 'Ext.data.Model',
    fields: ['id', 'name', 'password'],
    
    proxy: {
        type: 'ajax',
        url: 'data/stations.json',
        reader: {
            type: 'json',
            root: 'results'
        }
    }
});
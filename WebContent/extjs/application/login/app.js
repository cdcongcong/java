Ext.application({
    name: 'Login',
    
    autoCreateViewport: true,
    
    models: ['LoginUser'],    
    stores: ['Stations', 'RecentSongs', 'SearchResults'],
    controllers: ['Station', 'Song']
});
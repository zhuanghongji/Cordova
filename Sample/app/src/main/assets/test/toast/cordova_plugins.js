cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
    {
        "id": "cordova-plugin-toast.toast",
        "file": "plugins/cordova-plugin-toast/www/WebToast.js",
        "pluginId": "cordova-plugin-toast",
        "clobbers": [
            "navigator.WebToast"
        ]
    }
];
module.exports.metadata = 
// TOP OF METADATA
{
    "cordova-plugin-toast": "1.0.0"
};
// BOTTOM OF METADATA
});
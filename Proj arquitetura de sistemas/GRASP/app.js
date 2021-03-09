const customConfig  = require('./config/customConfig');
const app = customConfig();


app.listen(process.env.PORT || 3000); 
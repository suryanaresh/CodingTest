var json = '{"a":"1","b":"2","c":"3"}';
var data = JSON.parse(json);

for (var key in data)
{
    console.log('key '+ key + ' : ' + 'value ' + data[key]);
}

//accessing values using keys

console.log(data['c']);


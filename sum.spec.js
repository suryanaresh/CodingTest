var chai = require('chai'); 
var chaiAsPromised = require('chai-as-promised'); 
chai.use(chaiAsPromised); 
var expect = chai.expect;
chai.use(CustomMatchers);
var x;
var y;
module.exports = function () {
    this.setDefaultTimeout(60000);
    this.Given(/^two numbers "([^"]*)" and "([^"]*)"$/, function (first, second) {
        x=first;
		y=second;
    } );
    this.Then( /^add two numbers and store in "([^"]*)"$/, function (sum) {
        sum = x+y;
		console.log(sum);
    } );
}
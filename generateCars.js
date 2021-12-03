let carList = require("./CarList.json");
let carKeys = Object.keys(carList);

let randomMakeAndModel = () => {
  let m = carKeys[Math.ceil(Math.random() * carKeys.length - 1)];
  return {
    make: m,
    model: carList[m][Math.ceil(Math.random() * carList[m].length - 1)],
  };
};

let randomVin = () => {
  let c = () =>
    `${"ABCDEFGHIJKLMNOPQRSTUVWXYZ"[Math.ceil(Math.random() * 25)]}`;
  let d = () => `${Math.ceil(Math.random() * 9)}`;
  return (
    d() +
    c() +
    c() +
    c() +
    c() +
    d() +
    c() +
    c() +
    d() +
    c() +
    c() +
    c() +
    d() +
    d() +
    d() +
    d() +
    d()
  );
};

let country = "US";
let randomMileage = () => `${Math.ceil(Math.random() * 100000) + 1325}`;
let randomMpg = () => `${Math.ceil(Math.random() * 32) + 10}`;
let randomFuelType = () =>
  ["diesel", "gas", "electric"][Math.ceil(Math.random() * 2)];
let randomLocation = () => ["TX", "AZ", "NY"][Math.ceil(Math.random() * 2)];

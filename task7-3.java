// Задание 7.3 Есть массив объектов, представляющих собой пользователей, каждый из которых имеет свойство age (возраст). Создайте новый массив, содержащий только тех пользователей, чей возраст больше или равен 18. Затем создайте новый массив, содержащий только свойства name (имя) каждого пользователя.

// Решение:

const users = [
    { name: "Anna", age: 17 },
    { name: "Igor", age: 22 },
    { name: "Olga", age: 18 },
    { name: "Max", age: 15 }
];
// 1. Фильтруем пользователей по возрасту
const adults = users.filter(user => user.age >= 18);
// 2. Получаем массив имён
const names = adults.map(user => user.name);

console.log(names); // → ["Igor", "Olga"]

// можно записать так:
const adultNames = users
  .filter(user => user.age >= 18)
  .map(user => user.name);

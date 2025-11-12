// Задание 7.4 Создайте функцию setFullName, которая будет устанавливать свойство fullName у переданного ей объекта. Используйте метод bind, чтобы создать новую функцию setPersonFullName, которая будет устанавливать fullName для объекта person из предыдущего примера. Вызовите setPersonFullName с параметром "John Smith" и убедитесь, что свойство fullName объекта person было изменено соответствующим образом.

// Решение:

function setFullName(name) {
    this.fullName = name;
}

const person = {
    name: "Igor",
    age: 30
};
// Привязываем функцию к объекту person
const setPersonFullName = setFullName.bind(person);

// Вызываем с нужным параметром
setPersonFullName("John Smith");

console.log(person.fullName); // "John Smith"

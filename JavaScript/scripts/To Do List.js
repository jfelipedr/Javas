/*const testArray = [
    0,
    'Hello',
    true,
    {message: 'World'},
    [1, 2, 3]
];
console.log(testArray);
console.log(testArray[1]);

testArray.push('add a value at the end of array');
testArray.splice(0, 1);// Remove values from the arrary, first number is the index, second number is the amount of values to remove
//(0, 1) --> remove 1 value from the 0 index
console.log(testArray);*/
/*const toDoList = [1,2,3,4,5,6,7,8,9,10];

for (let i = 0; i < toDoList.length; i++) {
    const value = toDoList[i];
    console.log(value);
}*/
/*const nums = [1,2,3];
const total = 0;
//Acumulator parent
for (let i = 0; i < nums.length; i++) {
    const num = nums[i];
    total += num;
}*/
/*const array1 = ['some', 'values','as','example'];
const array2 = array1; //---> array2 points to the same memory adress of array1 Is not a copy!!, just the same reference
const array2 = array1.slice(); //---> copy the elements of array1 into array2, Is no longer a reference, so that the adress in memory of array2 is different from array1
*/

const toDoList = [];

renderToDoList();

function renderToDoList() {
    let toDoListHTML = '';

    /*toDoList.forEach((toDo, index) => {
        const { name, dueDate } = toDo;
        const html = `
            <div>${name}</div>
            <div>${dueDate}</div>
            <button onclick="
                toDoList.splice(${i},1);
                renderToDoList();
            " class="delete-todo-button">Delete</button>
            `;
        toDoListHTML += html;
    });*/

    for (let i = 0; i < toDoList.length; i++) {
        const toDo = toDoList[i];
        const { name, dueDate } = toDo; // same as ---> const name = toDo.name; const dueDate = toDo.dueDate;
        const html = `
            <div>${name}</div>
            <div>${dueDate}</div>
            <button onclick="
                toDoList.splice(${i},1);
                renderToDoList();
            " class="delete-todo-button">Delete</button>
            `;
        toDoListHTML += html;
    }

    document.querySelector('.js-todo-list')
        .innerHTML = toDoListHTML;
}

function addToDo() {
    const inputElement = document.querySelector('.js-name-input');
    const name = inputElement.value;

    const dateInputElement = document.querySelector('.js-due-date-input');
    const dueDate = dateInputElement.value;

    toDoList.push({
        name,//---> name: name,
        dueDate//---> dueDate: dueDate
    });

    inputElement.value = '';
    renderToDoList();
}
// add pageTitle
const pageTitle = 'My Shopping List';

// add groceries

const groceries = ['Banana', 'Orange', 'Apple', 'Carrot', 'Ground Beef', 'Water', 'Chicken', 'Candy', 'Pepsi', 'Rice'];



/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {

  const h1Element = document.getElementById('title');

  h1Element.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {

  const ulElement = document.getElementById('groceries');

    groceries.forEach(item => {

      const liElement = document.createElement('li');

      liElement.innerText = item;

      ulElement.appendChild(liElement);

  });

}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {

  const liElements = document.querySelectorAll('li');//getting all them stuff

  liElements.forEach(item => {

  item.classList.add('completed'); //adding css elements to the item

  //changing the class to 'completed'
  })



}


setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});

# java_vending_machine
it has 4 windows

in the 1rst u create the dimensions and slots for the vending machine

in the 2nd u create some products and fill up any available slots

in the 3rd u initialize the money it has to start with (with a drag n-drop menu)

and finally, in the 4rth window, u play (u pay money for products, choose to cancel an order etc)


there is an approach in there that i have personally not seen anywhere else. Since the principle of encapsulation is broken by the practice of reflexion i choose not to use a variable local to an object.
rather all variables live on another class on their own and u call them when u need them by saying someyhing like "variable.a = 2". I am aware this is not generally considered a good practice but i wanted to play with that idea


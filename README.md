# Android Basic Currency Updater

What can be improved:
- Error handling (Currently app will crash once you get any network error), we need to at least wrap it in `try...catch` block and show Alert Dialog with error message
- Build retrofit service during Application initialisation
- Currently, in our View Model we use List, but for optimisation purpose, we should use LinkedList and `push()` or `addFirst()` function to add item to the start of list (the complexity of this operation will be O(1), instead of constantly reversing our List). And then just use `take(50)` on the list to get latest 50 elements. 
- Better layer separation (Use clean architecture)
- Use dagger to provide and inject dependencies (Such as repository)
- Add mappers
- Don't use `notifyDataSetChanged()` in adapter, it's bad practice. Use `notifyItemInserted()` instead. Or better yet, use `DiffUtil`
- Unit Tests
- UI Tests
- Lint checks
- View binding
- Base classes for ViewModel, Activity, Adapter

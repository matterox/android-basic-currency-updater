# Android Basic Currency Updater

What can be improved:
- Error handleing (Currently app will crash once you get any network error), we need to at least wrap it in `try...catch` block and show Alert Dialog with error message
- Better layer seperation (Use clean architecture)
- Use dagger to provide and inject dependencies (Such as repository)
- Add mappers
- Don't use `notifyDataSetChanged()` in adapter, it's bad practice. Use `notifyItemInserted()` instead. Or better yet, use `DiffUtil`
University Guide
=======================
### Building

Source runs in Android Studio.

### Database

Located in Univer_guide\app\src\main\assets\databases.

### Package Layout

com.daviancorp.android.data.classes
  - Contains classes for data objects

com.daviancorp.android.data.database
  - Contains Cursors to return rows/tuples from the database queries.
  - MonsterHunterDatabaseHelper.java: direct queries to database
  - DataHelper.java: Used by loaders to query database; uses MonsterHunterDatabaseHelper for queries

com.daviancorp.android.loader
  - Contains loaders for UI to load data

com.daviancorp.android.ui.adapter
  - Pager adapters

com.daviancorp.android.ui.detail
  - Detail activities + fragments to display a specific object and related data

com.daviancorp.android.ui.dialog
  - 'About' dialog
  - Wishlist-related dialogs

com.daviancorp.android.ui.general
  - Base activities
  - Home activity
  - 'Sharpness' code to draw sharpness using values

com.daviancorp.android.ui.list
  - List activities + fragments
    - Navigated through the Home activity

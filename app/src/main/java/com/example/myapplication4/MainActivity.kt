<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:background="@drawable/background"
tools:context=".MainActivity">
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="sport"
android:textSize="30sp"
android:textStyle="bold"
android:textColor="@color/white"
android:layout_margin="12dp">
</TextView>

<GridLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_marginTop="100dp"
android:columnCount="2"
android:rowCount="3">

<androidx.cardview.widget.CardView
android:layout_width="150dp"
android:layout_height="150dp"
android:layout_rowWeight="1"
android:layout_columnWeight="1"
android:layout_marginLeft="16dp"
android:layout_marginRight="16dp"
android:layout_marginBottom="16dp"
app:cardCornerRadius="8dp"
app:cardElevation="8dp">
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
android:layout_gravity = "center_horizontal|center_vertical">
<ImageView
android:layout_width="120dp"
android:layout_height="120dp"
android:layout_gravity = "center_horizontal|center_vertical"
android:src="@drawable/on the road">
</ImageView>
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="center"
android:text="on the road"
android:textColor="@color/with"
android:textSize="20sp"
android:textStyle="bold">
</TextView>
</LinearLayout>
</androidx.cardview.widget.CardView>

<androidx.cardview.widget.CardView
android:layout_width="150dp"
android:layout_height="150dp"
android:layout_rowWeight="1"
android:layout_columnWeight="1"
android:layout_marginLeft="16dp"
android:layout_marginRight="16dp"
android:layout_marginBottom="16dp"
app:cardCornerRadius="8dp"
app:cardElevation="8dp">
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
android:layout_gravity = "center_horizontal|center_vertical">
<ImageView
android:layout_width="120dp"
android:layout_height="120dp"
android:layout_gravity = "center_horizontal|center_vertical"
android:src="@drawable/studio musik">
</ImageView>
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="center"
android:text="studio musik"
android:textColor="@color/blue"
android:textSize="20sp"
android:textStyle="bold">
</TextView>
</LinearLayout>
</androidx.cardview.widget.CardView>

<androidx.cardview.widget.CardView
android:layout_width="150dp"
android:layout_height="150dp"
android:layout_rowWeight="1"
android:layout_columnWeight="1"
android:layout_marginLeft="16dp"
android:layout_marginRight="16dp"
android:layout_marginBottom="16dp"
app:cardCornerRadius="8dp"
app:cardElevation="8dp">
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
android:layout_gravity = "center_horizontal|center_vertical">
<ImageView
android:layout_width="120dp"
android:layout_height="120dp"
android:layout_gravity = "center_horizontal|center_vertical"
android:src="@drawable/spot photo">
</ImageView>
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="center"
android:text="spot photo"
android:textColor="@color/with"
android:textSize="20sp"
android:textStyle="bold">
</TextView>
</LinearLayout>
</androidx.cardview.widget.CardView>

<androidx.cardview.widget.CardView
android:layout_width="150dp"
android:layout_height="150dp"
android:layout_rowWeight="1"
android:layout_columnWeight="1"
android:layout_marginLeft="16dp"
android:layout_marginRight="16dp"
android:layout_marginBottom="16dp"
app:cardCornerRadius="8dp"
app:cardElevation="8dp">
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
android:layout_gravity = "center_horizontal|center_vertical">
<ImageView
android:layout_width="120dp"
android:layout_height="120dp"
android:layout_gravity = "center_horizontal|center_vertical"
android:src="@drawable/recmendation_food">
</ImageView>
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="center"
android:text="recomendation_food"
android:textColor="@color/blue"
android:textSize="20sp"
android:textStyle="bold">
</TextView>
</LinearLayout>
</androidx.cardview.widget.CardView>

<androidx.cardview.widget.CardView
android:layout_width="150dp"
android:layout_height="150dp"
android:layout_rowWeight="1"
android:layout_columnWeight="1"
android:layout_marginLeft="16dp"
android:layout_marginRight="16dp"
android:layout_marginBottom="16dp"
app:cardCornerRadius="8dp"
app:cardElevation="8dp">
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
android:layout_gravity = "center_horizontal|center_vertical">
<ImageView
android:layout_width="120dp"
android:layout_height="120dp"
android:layout_gravity = "center_horizontal|center_vertical"
android:src="@drawable/bank">
</ImageView>
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="center"
android:text="bank"
android:textColor="@color/whith"
android:textSize="20sp"
android:textStyle="bold">
</TextView>
</LinearLayout>
</androidx.cardview.widget.CardView>

<androidx.cardview.widget.CardView
android:layout_width="150dp"
android:layout_height="150dp"
android:layout_rowWeight="1"
android:layout_columnWeight="1"
android:layout_marginLeft="16dp"
android:layout_marginRight="16dp"
android:layout_marginBottom="16dp"
app:cardCornerRadius="8dp"
app:cardElevation="8dp">
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
android:layout_gravity = "center_horizontal|center_vertical">
<ImageView
android:layout_width="110dp"
android:layout_height="110dp"
android:layout_gravity = "center_horizontal|center_vertical"
android:src="@drawable/recomendation_tour">
</ImageView>
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="center"
android:text="recomendation_tour"
android:textColor="@color/blue"
android:textSize="20sp"
android:textStyle="bold">
</TextView>
</LinearLayout>
</androidx.cardview.widget.CardView>


</GridLayout>

</RelativeLayout>
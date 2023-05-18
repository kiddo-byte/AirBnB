package com.example.airbnb

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomAdapter (var context: Context, var data:ArrayList<Booking>): BaseAdapter() {

    private class ViewHolder(row: View?) {
            var mTxtName: TextView
            var mTxtEmail: TextView
            var mTxtPhone:TextView
            var mTxtAge: TextView
            var mTxtResidence:TextView

            init {
                this.mTxtName = row?.findViewById(R.id.mTvName) as TextView
                this.mTxtEmail = row?.findViewById(R.id.mTvEmail) as TextView
                this.mTxtPhone = row?.findViewById(R.id.mTvPhone) as TextView
                this.mTxtAge = row?.findViewById(R.id.mTvAge) as TextView
                this.mTxtResidence = row?.findViewById(R.id.mTvResidence) as TextView

            }
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var view: View?
            var viewHolder: ViewHolder
            if (convertView == null) {
                var layout = LayoutInflater.from(context)
                view = layout.inflate(R.layout.bookings_layout, parent, false)
                viewHolder = ViewHolder(view)
                view.tag = viewHolder
            } else {
                view = convertView
                viewHolder = view.tag as ViewHolder
            }
            var item: Booking = getItem(position) as Booking
            viewHolder.mTxtName.text = item.name
            viewHolder.mTxtEmail.text = item.email
            viewHolder.mTxtPhone.text = item.phone
            viewHolder.mTxtAge.text = item.age
            viewHolder.mTxtResidence.text = item.residence
            return view as View
        }

        override fun getItem(position: Int): Any {
            return data.get(position)
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return data.count()
        }
    }

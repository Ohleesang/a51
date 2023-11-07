package com.example.a51

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(food: IntArray): String {
                var answer: String = ""
                //food[0] : 물의양 food[i] i번 음식의 수
                var foodCount = mutableListOf<Int>()
                for (i in 1 .. food.size-1){
                    foodCount.add(food[i]/2)
                }

                var count = 1
                while(!foodCount.isEmpty()){
                    for(i in 1..foodCount.get(0)){
                        answer = answer + count.toString()
                    }
                    foodCount.removeAt(0)
                    count++
                }
                answer = answer +"0" + answer.reversed()
                return answer
            }
        }
        val a = Solution()
        a.solution(intArrayOf(1,3,4,6))
        a.solution(intArrayOf(1,7,1,2))
    }
}
package com.edouardondo.moneyclap.controller.fragment.subFragment.devis

import android.animation.ObjectAnimator
import android.animation.TimeInterpolator
import android.os.Bundle
import android.os.Handler
import android.util.Property
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.BounceInterpolator
import android.widget.CompoundButton
import android.widget.RadioButton
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.edouardondo.moneyclap.R
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError


class StepOneFragment : Fragment(), Step {

    lateinit var from: CardView
    lateinit var to: CardView

    /** =================== Radio Button ===================*/
    lateinit var radioYes: RadioButton
    lateinit var radioNo: RadioButton


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView: View = inflater.inflate(R.layout.fragment_step_one, container, false)

        radioYes = rootView.findViewById(R.id.received_yes)
        radioNo = rootView.findViewById(R.id.received_no)

        from = rootView.findViewById(R.id.from)
        to = rootView.findViewById(R.id.to)

        var translateY = 550f

        radioYes.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {

                animate(
                    from,
                    View.TRANSLATION_Y,
                    from.translationY,
                    from.translationY + translateY,
                    1000,
                    BounceInterpolator()
                )

                animate(
                    to,
                    View.TRANSLATION_Y,
                    to.translationY,
                    to.translationY - translateY,
                    1000,
                    BounceInterpolator()
                )

            } else{

                animate(
                    to,
                    View.TRANSLATION_Y,
                    to.translationY,
                    to.translationY + translateY,
                    1000,
                    BounceInterpolator()
                )

                animate(
                    from,
                    View.TRANSLATION_Y,
                    from.translationY,
                    from.translationY - translateY,
                    1000,
                    BounceInterpolator()
                )
            }
        }

        return rootView
    }

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {

    }

    override fun onError(error: VerificationError) {

    }

    private fun animate(target: View,
                        property: Property<View, Float>,
                        from: Float,
                        to: Float,
                        duration: Long,
                        interpolator: TimeInterpolator) {

        val tY = ObjectAnimator.ofFloat(target,
            property,
            from,
            to)

        tY.duration = duration
        tY.interpolator = interpolator
        tY.start()
    }

}
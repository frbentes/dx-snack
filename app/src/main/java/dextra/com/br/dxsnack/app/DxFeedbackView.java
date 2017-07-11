package dextra.com.br.dxsnack.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import dextra.com.br.dxsnack.R;

public class DxFeedbackView extends LinearLayout {

    private TextView tvTitle, tvMessage;
    private Drawable mDrawable;
    private boolean isDrawableVisible;

    public DxFeedbackView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public DxFeedbackView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public DxFeedbackView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) {
        final TypedArray arr = getContext().obtainStyledAttributes(attrs, R.styleable.DxFeedbackView,
                defStyle, 0);

        String mTitle = arr.getString(R.styleable.DxFeedbackView_text);
        String mMessage = arr.getString(R.styleable.DxFeedbackView_subText);

        if (arr.hasValue(R.styleable.DxFeedbackView_drawable)) {
            mDrawable = arr.getDrawable(R.styleable.DxFeedbackView_drawable);
            mDrawable.setCallback(this);
        }

        arr.recycle();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.widget_feedback_view, this, true);

        setGravity(Gravity.CENTER);
        setOrientation(VERTICAL);

        this.tvTitle = (TextView) findViewById(R.id.tvTitle);
        this.tvMessage = (TextView) findViewById(R.id.tvMessage);

        this.tvTitle.setText(mTitle);
        if (!isDrawableVisible) {
            this.tvTitle.setCompoundDrawablesWithIntrinsicBounds(null, mDrawable, null, null);
        }
        this.tvMessage.setText(mMessage);
    }

    public void setDrawableVisibility(boolean isDrawableVisible) {
        this.isDrawableVisible = isDrawableVisible;
        if (!isDrawableVisible && tvTitle != null) {
            this.tvTitle.setCompoundDrawablesWithIntrinsicBounds(null, mDrawable, null, null);
        } else if (tvTitle != null) {
            this.tvTitle.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    public void setTitle(int resMsg) {
        this.tvTitle.setText(resMsg);
    }

    public void setTitle(int resMsg, int resImage) {
        this.tvTitle.setText(resMsg);
        this.tvTitle.setCompoundDrawablesWithIntrinsicBounds(0, resImage, 0, 0);
    }

    public void setMessage(int resMsg) {
        if (resMsg == 0) {
            this.tvMessage.setText("");
        } else {
            this.tvMessage.setText(resMsg);
        }
    }

    public void setDrawable(Drawable drawable) {
        this.mDrawable = drawable;
        this.tvTitle.setCompoundDrawablesWithIntrinsicBounds(null, mDrawable, null, null);
    }

}

package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CursorArrowRipple: ImageVector
    get() {
        if (_CursorArrowRipple != null) {
            return _CursorArrowRipple!!
        }
        _CursorArrowRipple = ImageVector.Builder(
            name = "Outlined.CursorArrowRipple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.042f, 21.672f)
                lineTo(13.684f, 16.6f)
                moveToRelative(0f, 0f)
                lineToRelative(-2.51f, 2.225f)
                lineToRelative(0.569f, -9.47f)
                lineToRelative(5.227f, 7.917f)
                lineToRelative(-3.286f, -0.672f)
                close()
                moveTo(6.166f, 16.333f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20.25f, 10.5f)
                moveTo(8.288f, 14.212f)
                arcTo(5.25f, 5.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17.25f, 10.5f)
            }
        }.build()

        return _CursorArrowRipple!!
    }

@Suppress("ObjectPropertyName")
private var _CursorArrowRipple: ImageVector? = null

package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowUturnLeft: ImageVector
    get() {
        if (_ArrowUturnLeft != null) {
            return _ArrowUturnLeft!!
        }
        _ArrowUturnLeft = ImageVector.Builder(
            name = "Outlined.ArrowUturnLeft",
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
                moveTo(9f, 15f)
                lineTo(3f, 9f)
                moveToRelative(0f, 0f)
                lineToRelative(6f, -6f)
                moveTo(3f, 9f)
                horizontalLineToRelative(12f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
                horizontalLineToRelative(-3f)
            }
        }.build()

        return _ArrowUturnLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUturnLeft: ImageVector? = null

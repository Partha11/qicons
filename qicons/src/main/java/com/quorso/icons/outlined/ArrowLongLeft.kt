package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowLongLeft: ImageVector
    get() {
        if (_ArrowLongLeft != null) {
            return _ArrowLongLeft!!
        }
        _ArrowLongLeft = ImageVector.Builder(
            name = "Outlined.ArrowLongLeft",
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
                moveTo(6.75f, 15.75f)
                lineTo(3f, 12f)
                moveToRelative(0f, 0f)
                lineToRelative(3.75f, -3.75f)
                moveTo(3f, 12f)
                horizontalLineToRelative(18f)
            }
        }.build()

        return _ArrowLongLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLongLeft: ImageVector? = null

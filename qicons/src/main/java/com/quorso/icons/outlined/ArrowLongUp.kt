package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowLongUp: ImageVector
    get() {
        if (_ArrowLongUp != null) {
            return _ArrowLongUp!!
        }
        _ArrowLongUp = ImageVector.Builder(
            name = "Outlined.ArrowLongUp",
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
                moveTo(8.25f, 6.75f)
                lineTo(12f, 3f)
                moveToRelative(0f, 0f)
                lineToRelative(3.75f, 3.75f)
                moveTo(12f, 3f)
                verticalLineToRelative(18f)
            }
        }.build()

        return _ArrowLongUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLongUp: ImageVector? = null

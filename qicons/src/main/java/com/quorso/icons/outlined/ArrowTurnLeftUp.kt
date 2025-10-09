package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowTurnLeftUp: ImageVector
    get() {
        if (_ArrowTurnLeftUp != null) {
            return _ArrowTurnLeftUp!!
        }
        _ArrowTurnLeftUp = ImageVector.Builder(
            name = "Outlined.ArrowTurnLeftUp",
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
                moveTo(11.99f, 7.5f)
                lineTo(8.24f, 3.75f)
                moveToRelative(0f, 0f)
                lineTo(4.49f, 7.5f)
                moveToRelative(3.75f, -3.75f)
                verticalLineToRelative(16.499f)
                horizontalLineToRelative(11.25f)
            }
        }.build()

        return _ArrowTurnLeftUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTurnLeftUp: ImageVector? = null

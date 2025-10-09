package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowTurnDownLeft: ImageVector
    get() {
        if (_ArrowTurnDownLeft != null) {
            return _ArrowTurnDownLeft!!
        }
        _ArrowTurnDownLeft = ImageVector.Builder(
            name = "Outlined.ArrowTurnDownLeft",
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
                moveToRelative(7.49f, 12f)
                lineToRelative(-3.75f, 3.75f)
                moveToRelative(0f, 0f)
                lineToRelative(3.75f, 3.75f)
                moveToRelative(-3.75f, -3.75f)
                horizontalLineToRelative(16.5f)
                verticalLineTo(4.499f)
            }
        }.build()

        return _ArrowTurnDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTurnDownLeft: ImageVector? = null

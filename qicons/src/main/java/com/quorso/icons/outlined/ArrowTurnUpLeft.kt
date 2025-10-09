package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowTurnUpLeft: ImageVector
    get() {
        if (_ArrowTurnUpLeft != null) {
            return _ArrowTurnUpLeft!!
        }
        _ArrowTurnUpLeft = ImageVector.Builder(
            name = "Outlined.ArrowTurnUpLeft",
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
                moveTo(7.49f, 12f)
                lineTo(3.74f, 8.248f)
                moveToRelative(0f, 0f)
                lineToRelative(3.75f, -3.75f)
                moveToRelative(-3.75f, 3.75f)
                horizontalLineToRelative(16.5f)
                verticalLineTo(19.5f)
            }
        }.build()

        return _ArrowTurnUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTurnUpLeft: ImageVector? = null

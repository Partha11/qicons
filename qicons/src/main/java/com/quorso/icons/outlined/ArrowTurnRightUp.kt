package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowTurnRightUp: ImageVector
    get() {
        if (_ArrowTurnRightUp != null) {
            return _ArrowTurnRightUp!!
        }
        _ArrowTurnRightUp = ImageVector.Builder(
            name = "Outlined.ArrowTurnRightUp",
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
                moveToRelative(11.99f, 7.5f)
                lineToRelative(3.75f, -3.75f)
                moveToRelative(0f, 0f)
                lineToRelative(3.75f, 3.75f)
                moveToRelative(-3.75f, -3.75f)
                verticalLineToRelative(16.499f)
                horizontalLineTo(4.49f)
            }
        }.build()

        return _ArrowTurnRightUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTurnRightUp: ImageVector? = null

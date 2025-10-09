package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowUpCircle: ImageVector
    get() {
        if (_ArrowUpCircle != null) {
            return _ArrowUpCircle!!
        }
        _ArrowUpCircle = ImageVector.Builder(
            name = "Outlined.ArrowUpCircle",
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
                moveToRelative(15f, 11.25f)
                lineToRelative(-3f, -3f)
                moveToRelative(0f, 0f)
                lineToRelative(-3f, 3f)
                moveToRelative(3f, -3f)
                verticalLineToRelative(7.5f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
            }
        }.build()

        return _ArrowUpCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpCircle: ImageVector? = null

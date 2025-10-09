package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ViewfinderCircle: ImageVector
    get() {
        if (_ViewfinderCircle != null) {
            return _ViewfinderCircle!!
        }
        _ViewfinderCircle = ImageVector.Builder(
            name = "Outlined.ViewfinderCircle",
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
                moveTo(7.5f, 3.75f)
                horizontalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 6f)
                verticalLineToRelative(1.5f)
                moveTo(16.5f, 3.75f)
                horizontalLineTo(18f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.25f, 6f)
                verticalLineToRelative(1.5f)
                moveToRelative(0f, 9f)
                verticalLineTo(18f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 20.25f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(-9f, 0f)
                horizontalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 18f)
                verticalLineToRelative(-1.5f)
                moveTo(15f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                close()
            }
        }.build()

        return _ViewfinderCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ViewfinderCircle: ImageVector? = null
